package vane.active.mq.demo.util;

import cn.hutool.core.net.NetUtil;

import javax.swing.*;

public class ActiveMQUtil {

  public static void main(String[] args) {
    checkServer();
  }

  public static void checkServer() {
    if (NetUtil.isUsableLocalPort(8161)) {
      JOptionPane.showMessageDialog(null, "ActiveMQ服务未启动");
      System.exit(1);
    }
  }
}

package com.xu.doc.common.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Log4j2统一方法
 */
public class Log {
    static Logger logger = LogManager.getLogger();

    public static void info(String tag, Object message) {
        String info = " [I]  " + "["+tag+"]" + "  " + message;
        logger.info(info);
    }
    public static void info(Object message) {
        String info = " [I]  " + message;
        logger.info(info);
    }

    public static void debug(String tag, Object message) {
        String info = "[D]  " + "["+tag+"]" + "  " + message;
        logger.debug(info);
    }

    public static void debug(Object message) {
        String info = "[D]  " + message;
        logger.debug(info);
    }

    public static void warn(String tag, Object message) {
        String info = " [W]  "+ "["+tag+"]" + "  " + message;
        logger.warn(info);
    }
    public static void warn(Object  message) {
        String info = " [w]  " + message;
        logger.warn(info);
    }

    public static void error(String tag, Object message) {
        String info = " [E]  " + "["+tag+"]" + "  " + message;
        logger.error(info);

    }

    public static void error(String tag, Exception e) {
        String info = " [E]  " + tag;
        logger.error(info);
    }
}

package utils

import org.apache.log4j.{BasicConfigurator, Logger}

object LoggerFactory {

  val logger = Logger.getLogger("MyLogger")
  BasicConfigurator.configure()

  def info(message: String) = logger.info(message)

  def error(message: String) = logger.error(message)

  def warn(message: String) = logger.warn(message)

  def debug(message: String) = logger.debug(message)

}


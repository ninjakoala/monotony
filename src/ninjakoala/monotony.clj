(ns ninjakoala.monotony
  (:require [clojure.tools.logging :as log]
            [taoensso.timbre :as timbre :refer [set-config!]]))

(defn- log-fn
  [{:keys [level message ns throwable] :as appender-args-map}]
  (log/log ns level throwable message))

(defn redirect-logging
  []
  (timbre/set-config! {:appenders {:slf4j {:enabled? true
                                           :fn log-fn}}}))

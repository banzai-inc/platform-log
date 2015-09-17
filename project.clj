(defproject com.banzai/platform-log "0.1.0"
  :description "Logging library for Banzai's eLearning cloud platform"
  :url "https://github.com/banzai-inc/platform-log"
  :license {}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.taoensso/timbre "4.1.1"]]
  :plugins [[s3-wagon-private "1.1.2"]]
  :repositories [["private" {:url "s3p://banzai-clojure/releases/"
                             :username ~(System/getenv "AWS_ACCESS_KEY_ID")
                             :passphrase ~(System/getenv "AWS_SECRET_KEY")}]])

def call(Map config = [:]) {
    sh "${config.path} ${config.image}:${config.tag}"
}
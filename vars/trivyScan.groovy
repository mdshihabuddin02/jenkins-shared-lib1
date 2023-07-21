def call(Map config = [:]) {
    sh "${config.path} image ${config.image}:${config.tag}"
}

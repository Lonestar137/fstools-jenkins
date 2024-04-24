def withPodmanContainer(String imageName, String arguments, Closure closure) {
    // Start the Podman container
    def containerId = startPodmanContainer(imageName, arguments)
    
    try {
        // Execute the closure inside the container
        closure.call()
    } finally {
        // Stop the Podman container
        stopPodmanContainer(containerId)
    }
}

def startPodmanContainer(String imageName, String arguments) {
    // Implement the logic to start the Podman container here
    // For example:
    def command = 'podman run -d --rm ' + imageName + ' ' + arguments
    echo "${command}"
    def process = sh "${command}"
    echo "${process}"
    def containerId = process.stdout.trim()
    echo "${containerId}"
    return containerId
}

def stopPodmanContainer(String containerId) {
    // Implement the logic to stop the Podman container here
    // For example:
    def command = "podman stop " + containerId
    def process = sh "${command}"
}

def withPodmanContainer(String imageName, List<String> arguments, Closure closure) {
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

def startPodmanContainer(String imageName, List<String> arguments) {
    // Implement the logic to start the Podman container here
    // For example:
    def command = ['/usr/bin/podman', 'run', '-d', imageName] + arguments
    def process = command.execute()
    process.waitFor()
    def containerId = process.text.trim()
    return containerId
}

def stopPodmanContainer(String containerId) {
    // Implement the logic to stop the Podman container here
    // For example:
    def command = ['podman', 'stop', containerId]
    def process = command.execute()
    process.waitFor()
}

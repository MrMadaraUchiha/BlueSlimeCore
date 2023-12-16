tasks.named("jar") {
    enabled = false
}

subprojects {
    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    repositories {
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
    }

    dependencies {
        // BungeeCord API
        compileOnly("net.md-5:bungeecord-api:1.20-R0.1")
    }
}

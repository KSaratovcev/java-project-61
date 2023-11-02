plugins {
    id 'java'
    id 'application'
}

repositories {
    jcenter()
}

dependencies {
    implementation 'org.apache.commons:commons-lang3:3.12.0'
}

application {
    mainClass.set('hexlet.code.App')
}

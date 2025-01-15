Results for the Software Interview Problems
===

# Problem - 1

- C++ Docker Image

```
nghianguyen@Nghias-MBP c++ % docker build -t cpp-lru-cache .
[+] Building 0.6s (9/9) FINISHED                                                                                                                                                                               docker:desktop-linux
 => [internal] load build definition from Dockerfile                                                                                                                                                                           0.0s
 => => transferring dockerfile: 388B                                                                                                                                                                                           0.0s
 => [internal] load metadata for docker.io/library/gcc:latest                                                                                                                                                                  0.5s
 => [internal] load .dockerignore                                                                                                                                                                                              0.0s
 => => transferring context: 2B                                                                                                                                                                                                0.0s
 => [internal] load build context                                                                                                                                                                                              0.0s
 => => transferring context: 756B                                                                                                                                                                                              0.0s
 => [1/4] FROM docker.io/library/gcc:latest@sha256:d2ae7d55e007c1b50b72d39b6b9e0438c9b50404d77743156cf7498369329b1e                                                                                                            0.0s
 => => resolve docker.io/library/gcc:latest@sha256:d2ae7d55e007c1b50b72d39b6b9e0438c9b50404d77743156cf7498369329b1e                                                                                                            0.0s
 => CACHED [2/4] COPY . /usr/src/                                                                                                                                                                                              0.0s
 => CACHED [3/4] WORKDIR /usr/src/                                                                                                                                                                                             0.0s
 => CACHED [4/4] RUN make                                                                                                                                                                                                      0.0s
 => exporting to image                                                                                                                                                                                                         0.0s
 => => exporting layers                                                                                                                                                                                                        0.0s
 => => exporting manifest sha256:a44cfd5ad37e14fb9f2552eb491220248f7ac3585d9899e5c368cad21f127329                                                                                                                              0.0s
 => => exporting config sha256:65e08a5df4f9aa39075fc04a3e9e108cdf8969eb383d79ebd99c9b1a6ec5d179                                                                                                                                0.0s
 => => exporting attestation manifest sha256:f86ddd105749103c093ae48506d1814e269fb26c0bf02d744e4a5e7220d03c24                                                                                                                  0.0s
 => => exporting manifest list sha256:e2ef87884e1624b0215c39f32eab0b03f16d3db75349948c4d080aad574c19ba                                                                                                                         0.0s
 => => naming to docker.io/library/cpp-lru-cache:latest                                                                                                                                                                        0.0s
 => => unpacking to docker.io/library/cpp-lru-cache:latest
```

-  Python Docker Image

```
nghianguyen@Nghias-MBP python % docker build -t python-lru-cache .
[+] Building 0.6s (8/8) FINISHED                                                                                                                                                                               docker:desktop-linux
 => [internal] load build definition from Dockerfile                                                                                                                                                                           0.0s
 => => transferring dockerfile: 297B                                                                                                                                                                                           0.0s
 => [internal] load metadata for docker.io/library/python:3                                                                                                                                                                    0.5s
 => [internal] load .dockerignore                                                                                                                                                                                              0.0s
 => => transferring context: 2B                                                                                                                                                                                                0.0s
 => [internal] load build context                                                                                                                                                                                              0.0s
 => => transferring context: 131B                                                                                                                                                                                              0.0s
 => [1/3] FROM docker.io/library/python:3@sha256:a8aab6d8cce4d31c10dda046d6d940fc30b64de3438f7969f0db0ab19f3469f9                                                                                                              0.0s
 => => resolve docker.io/library/python:3@sha256:a8aab6d8cce4d31c10dda046d6d940fc30b64de3438f7969f0db0ab19f3469f9                                                                                                              0.0s
 => CACHED [2/3] COPY src /usr/src/                                                                                                                                                                                            0.0s
 => CACHED [3/3] WORKDIR /usr/src/                                                                                                                                                                                             0.0s
 => exporting to image                                                                                                                                                                                                         0.0s
 => => exporting layers                                                                                                                                                                                                        0.0s
 => => exporting manifest sha256:9066ba4db5b30f9301078485f6a745aa31128d57c3ae0726d332a59ac5a6f13d                                                                                                                              0.0s
 => => exporting config sha256:7215b970ee25c7792a6ed18a39f756741337c46495ccc48476cce5be88f3fa51                                                                                                                                0.0s
 => => exporting attestation manifest sha256:e8faf62651bcaa8ee871b1ef061270ad7e0b0b90b5db10493db51ca580369779                                                                                                                  0.0s
 => => exporting manifest list sha256:7e22ed96c1fa5b80657a1c4364cac02e8d690b63600990fecad47507db131d60                                                                                                                         0.0s
 => => naming to docker.io/library/python-lru-cache:latest                                                                                                                                                                     0.0s
 => => unpacking to docker.io/library/python-lru-cache:latest
```

- Java Docker Image

```
nghianguyen@Nghias-MBP java % docker build -t java-lru-cache .
[+] Building 0.5s (9/9) FINISHED                                                                                                                                                                               docker:desktop-linux
 => [internal] load build definition from Dockerfile                                                                                                                                                                           0.0s
 => => transferring dockerfile: 457B                                                                                                                                                                                           0.0s
 => [internal] load metadata for docker.io/library/maven:latest                                                                                                                                                                0.4s
 => [internal] load .dockerignore                                                                                                                                                                                              0.0s
 => => transferring context: 2B                                                                                                                                                                                                0.0s
 => [internal] load build context                                                                                                                                                                                              0.0s
 => => transferring context: 4.47kB                                                                                                                                                                                            0.0s
 => [1/4] FROM docker.io/library/maven:latest@sha256:b89ede2635fb8ebd9ba7a3f7d56140f2bd31337b8b0e9fa586b657ee003307a7                                                                                                          0.0s
 => => resolve docker.io/library/maven:latest@sha256:b89ede2635fb8ebd9ba7a3f7d56140f2bd31337b8b0e9fa586b657ee003307a7                                                                                                          0.0s
 => CACHED [2/4] COPY . /usr/src/                                                                                                                                                                                              0.0s
 => CACHED [3/4] WORKDIR /usr/src/                                                                                                                                                                                             0.0s
 => CACHED [4/4] RUN mvn -X package                                                                                                                                                                                            0.0s
 => exporting to image                                                                                                                                                                                                         0.0s
 => => exporting layers                                                                                                                                                                                                        0.0s
 => => exporting manifest sha256:e0b60ebb167437fb464befa899f2ae0d5138bd7522f96dccbc86063c06acfe37                                                                                                                              0.0s
 => => exporting config sha256:840c4b6d0100bb7bea7901a4ef8df9a3f33f2072a4e8a5f474bd472899465ba1                                                                                                                                0.0s
 => => exporting attestation manifest sha256:ff61af252ffd1793df30371340dbed2683d04f029c6537854425da89cc34139f                                                                                                                  0.0s
 => => exporting manifest list sha256:99e0da5be1e2df39be28f00d1a4b3d525740cd6b6a872105e1cb934d84012427                                                                                                                         0.0s
 => => naming to docker.io/library/java-lru-cache:latest                                                                                                                                                                       0.0s
 => => unpacking to docker.io/library/java-lru-cache:latest 
```

# Problem - 2

- C++ Run

```
docker run --rm cpp-lru-cache 
```

- Java Run

```
docker run --rm java-lru-cache 
```

- Python Run

```
docker run --rm python-lru-cache 
```

# Problem - 3

- C++ Docker Run Output

```
5 4 1 3
```

- Java Docker Run Output

```
5 4 1 3
```

- Python Docker Run Output

```
5 4 1 3
```

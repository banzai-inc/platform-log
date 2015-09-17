# platform-log

Logging library in Clojure for Banzai's eLearning cloud platform.

## Usage

Supports the following functions: `debug, info, warn, error`.

Each function receives two things: an `id` of the resource used to reference the log instance (e.g. a user id, request id, etc.) and one or more messages.

Example:

```clojure
(info 123 "Hello, world")

=> INFO: [123] Hello, world
```

## License

Copyright © 2015 Banzai Inc.

[![Clojars Project](https://img.shields.io/clojars/v/com.ninjakoala/monotony.svg)](https://clojars.org/com.ninjakoala/monotony) [![Build Status](https://travis-ci.org/ninjakoala/monotony.svg?branch=master)](https://travis-ci.org/ninjakoala/monotony)

```clojure
(ns yourapp
  (:require [ninjakoala.monotony :refer [redirect-logging!]]))

(redirect-logging!)
```

This will go ahead and replace all timbre appenders with a single appender which uses `clojure.tools.logging/log` instead.

# monotony

Redirects [timbre](https://github.com/ptaoussanis/timbre) logging into [tools.logging](https://github.com/clojure/tools.logging).

## Justification

It's definitely not that I don't like timbre. I think it's a great idea and am looking forward to using it properly in the future. However, at `$DAYJOB` we already have well-established custom [Logback](http://logback.qos.ch/) appenders and have finally got all our existing libraries to redirect their logging to [SLF4J](http://www.slf4j.org/). I don't have time at the moment and I love [carmine](https://github.com/ptaoussanis/carmine) too much to have its logging go somewhere else.

## License

Copyright © 2014 Neil Prosser

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

# webtools.reagent

Various helper functions and other things specifically for use in 
ClojureScript/Reagent applications.

Includes ready to use Reagent component adapter definitions for React
components from the following libraries:

* [React-Bootstrap][1]
* [React-Bootstrap-DateTimePicker][2]
* [React-Select][3]

[1]: https://react-bootstrap.github.io/
[2]: https://github.com/quri/react-bootstrap-datetimepicker
[3]: https://github.com/JedWatson/react-select

> Please note that this library is mainly intended for my own personal
> use and as such some functionality may be overly opinionated.

## Leiningen

```clojure
[gered/webtools.reagent "0.1.1"]
```

## React/Bootstrap Library Components CSS

The React/Bootstrap components provided by the libraries used by
webtools.reagent each have their own associated CSS stylesheet which
will need to be included in your application if you use these
components.

#### React-Bootstrap

Just the standard [Bootstrap CSS stylesheet][4] (plus optional theme):

[4]: http://getbootstrap.com/getting-started/#download-cdn

    https://maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css
    https://maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap-theme.min.css

#### React-Bootstrap-DateTimePicker

    https://unpkg.com/react-bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css

#### React-Select

    https://unpkg.com/react-select/dist/react-select.min.css


## License

Copyright © 2016 Gered King

Distributed under the the MIT License. See LICENSE for more details.

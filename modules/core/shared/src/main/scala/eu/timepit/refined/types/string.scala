package eu.timepit.refined.types

import eu.timepit.refined.W
import eu.timepit.refined.api.Refined
import eu.timepit.refined.collection.NonEmpty
import eu.timepit.refined.string.MatchesRegex

/** Module for `String` refined types. */
object string extends StringTypes

trait StringTypes {

  /** A `String` that is not empty. */
  type NonEmptyString = String Refined NonEmpty

  /** A `String` that contains no leading or trailing whitespace. */
  type TrimmedString = String Refined MatchesRegex[W.`"""^(?!\\s).*(?<!\\s)"""`.T]
}

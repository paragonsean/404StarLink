# BurninSubtitleFallbackFont

Specify the font that you want the service to use for your burn in captions when your input captions specify a font that MediaConvert doesn't support. When you set Fallback font (FallbackFont) to best match (BEST_MATCH), or leave blank, MediaConvert uses a supported font that most closely matches the font that your input captions specify. When there are multiple unsupported fonts in your input captions, MediaConvert matches each font with the supported font that matches best. When you explicitly choose a replacement font, MediaConvert uses that font to replace all unsupported fonts from your input.

## Enum

* `BEST_MATCH` (value: `'BEST_MATCH'`)

* `MONOSPACED_SANSSERIF` (value: `'MONOSPACED_SANSSERIF'`)

* `MONOSPACED_SERIF` (value: `'MONOSPACED_SERIF'`)

* `PROPORTIONAL_SANSSERIF` (value: `'PROPORTIONAL_SANSSERIF'`)

* `PROPORTIONAL_SERIF` (value: `'PROPORTIONAL_SERIF'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



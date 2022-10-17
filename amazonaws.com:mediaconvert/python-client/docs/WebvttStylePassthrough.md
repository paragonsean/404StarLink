# WebvttStylePassthrough

To use the available style, color, and position information from your input captions: Set Style passthrough (stylePassthrough) to Enabled (ENABLED). MediaConvert uses default settings when style and position information is missing from your input captions. To recreate the input captions exactly: Set Style passthrough to Strict (STRICT). MediaConvert automatically applies timing adjustments, including adjustments for frame rate conversion, ad avails, and input clipping. Your input captions format must be WebVTT. To ignore the style and position information from your input captions and use simplified output captions: Set Style passthrough to Disabled (DISABLED), or leave blank.

## Enum

* `ENABLED` (value: `'ENABLED'`)

* `DISABLED` (value: `'DISABLED'`)

* `STRICT` (value: `'STRICT'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



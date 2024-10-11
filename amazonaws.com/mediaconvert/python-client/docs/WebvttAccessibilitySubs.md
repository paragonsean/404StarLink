# WebvttAccessibilitySubs

Set Accessibility subtitles to Enabled if the ISMC or WebVTT captions track is intended to provide accessibility for people who are deaf or hard of hearing. When you enable this feature, MediaConvert adds the following attributes under EXT-X-MEDIA in the HLS or CMAF manifest for this track: CHARACTERISTICS=\"public.accessibility.describes-spoken-dialog,public.accessibility.describes-music-and-sound\" and AUTOSELECT=\"YES\". Keep the default value, Disabled, if the captions track is not intended to provide such accessibility. MediaConvert will not add the above attributes.

## Enum

* `DISABLED` (value: `'DISABLED'`)

* `ENABLED` (value: `'ENABLED'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



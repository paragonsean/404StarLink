# HlsAudioTrackType

Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO

## Enum

* `ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT` (value: `'ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT'`)

* `ALTERNATE_AUDIO_AUTO_SELECT` (value: `'ALTERNATE_AUDIO_AUTO_SELECT'`)

* `ALTERNATE_AUDIO_NOT_AUTO_SELECT` (value: `'ALTERNATE_AUDIO_NOT_AUTO_SELECT'`)

* `AUDIO_ONLY_VARIANT_STREAM` (value: `'AUDIO_ONLY_VARIANT_STREAM'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



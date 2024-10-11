# CaptionDestinationType

Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Note that your choice of video output container constrains your choice of output captions format. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/captions-support-tables.html. If you are using SCTE-20 and you want to create an output that complies with the SCTE-43 spec, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED). To create a non-compliant output where the embedded captions come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).

## Enum

* `BURN_IN` (value: `'BURN_IN'`)

* `DVB_SUB` (value: `'DVB_SUB'`)

* `EMBEDDED` (value: `'EMBEDDED'`)

* `EMBEDDED_PLUS_SCTE20` (value: `'EMBEDDED_PLUS_SCTE20'`)

* `IMSC` (value: `'IMSC'`)

* `SCTE20_PLUS_EMBEDDED` (value: `'SCTE20_PLUS_EMBEDDED'`)

* `SCC` (value: `'SCC'`)

* `SRT` (value: `'SRT'`)

* `SMI` (value: `'SMI'`)

* `TELETEXT` (value: `'TELETEXT'`)

* `TTML` (value: `'TTML'`)

* `WEBVTT` (value: `'WEBVTT'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



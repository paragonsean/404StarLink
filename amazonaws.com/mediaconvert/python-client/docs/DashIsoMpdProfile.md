# DashIsoMpdProfile

Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).

## Enum

* `MAIN_PROFILE` (value: `'MAIN_PROFILE'`)

* `ON_DEMAND_PROFILE` (value: `'ON_DEMAND_PROFILE'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



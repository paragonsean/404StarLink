# M2tsSegmentationMarkers

Inserts segmentation markers at each segmentation_time period. rai_segstart sets the Random Access Indicator bit in the adaptation field. rai_adapt sets the RAI bit and adds the current timecode in the private data bytes. psi_segstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.

## Enum

* `NONE` (value: `'NONE'`)

* `RAI_SEGSTART` (value: `'RAI_SEGSTART'`)

* `RAI_ADAPT` (value: `'RAI_ADAPT'`)

* `PSI_SEGSTART` (value: `'PSI_SEGSTART'`)

* `EBP` (value: `'EBP'`)

* `EBP_LEGACY` (value: `'EBP_LEGACY'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



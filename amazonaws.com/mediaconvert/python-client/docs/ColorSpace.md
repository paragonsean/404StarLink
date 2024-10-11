# ColorSpace

If your input video has accurate color space metadata, or if you don't know about color space: Keep the default value, Follow. MediaConvert will automatically detect your input color space. If your input video has metadata indicating the wrong color space, or has missing metadata: Specify the accurate color space here. If your input video is HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or if that metadata is present but not accurate: Choose Force HDR 10. Specify correct values in the input HDR 10 metadata settings. For more information about HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr. When you specify an input color space, MediaConvert uses the following color space metadata, which includes color primaries, transfer characteristics, and matrix coefficients:  * HDR 10: BT.2020, PQ, BT.2020 non-constant  * HLG 2020: BT.2020, HLG, BT.2020 non-constant  * P3DCI (Theater): DCIP3, SMPTE 428M, BT.709  * P3D65 (SDR): Display P3, sRGB, BT.709  * P3D65 (HDR): Display P3, PQ, BT.709

## Enum

* `FOLLOW` (value: `'FOLLOW'`)

* `REC_601` (value: `'REC_601'`)

* `REC_709` (value: `'REC_709'`)

* `HDR10` (value: `'HDR10'`)

* `HLG_2020` (value: `'HLG_2020'`)

* `P3DCI` (value: `'P3DCI'`)

* `P3_D65_SDR` (value: `'P3D65_SDR'`)

* `P3_D65_HDR` (value: `'P3D65_HDR'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



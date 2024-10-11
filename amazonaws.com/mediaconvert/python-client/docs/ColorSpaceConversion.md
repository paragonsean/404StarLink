# ColorSpaceConversion

Specify the color space you want for this output. The service supports conversion between HDR formats, between SDR formats, from SDR to HDR, and from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range. The converted video has an HDR format, but visually appears the same as an unconverted output. HDR to SDR conversion uses tone mapping to approximate the outcome of manually regrading from HDR to SDR. When you specify an output color space, MediaConvert uses the following color space metadata, which includes color primaries, transfer characteristics, and matrix coefficients:   * HDR 10: BT.2020, PQ, BT.2020 non-constant   * HLG 2020: BT.2020, HLG, BT.2020 non-constant   * P3DCI (Theater): DCIP3, SMPTE 428M, BT.709   * P3D65 (SDR): Display P3, sRGB, BT.709   * P3D65 (HDR): Display P3, PQ, BT.709

## Enum

* `NONE` (value: `'NONE'`)

* `FORCE_601` (value: `'FORCE_601'`)

* `FORCE_709` (value: `'FORCE_709'`)

* `FORCE_HDR10` (value: `'FORCE_HDR10'`)

* `FORCE_HLG_2020` (value: `'FORCE_HLG_2020'`)

* `FORCE_P3_DCI` (value: `'FORCE_P3DCI'`)

* `FORCE_P3_D65_SDR` (value: `'FORCE_P3D65_SDR'`)

* `FORCE_P3_D65_HDR` (value: `'FORCE_P3D65_HDR'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# InputRotate

Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service doesn't pass through rotation metadata.

## Enum

* `DEGREE_0` (value: `'DEGREE_0'`)

* `DEGREES_90` (value: `'DEGREES_90'`)

* `DEGREES_180` (value: `'DEGREES_180'`)

* `DEGREES_270` (value: `'DEGREES_270'`)

* `AUTO` (value: `'AUTO'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



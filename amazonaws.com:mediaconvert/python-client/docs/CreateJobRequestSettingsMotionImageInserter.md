# CreateJobRequestSettingsMotionImageInserter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**framerate** | [**MotionImageInserterFramerate**](MotionImageInserterFramerate.md) |  | [optional] 
**input** | **str** |  | [optional] 
**insertion_mode** | [**MotionImageInsertionMode**](MotionImageInsertionMode.md) |  | [optional] 
**offset** | [**MotionImageInserterOffset**](MotionImageInserterOffset.md) |  | [optional] 
**playback** | [**MotionImagePlayback**](MotionImagePlayback.md) |  | [optional] 
**start_time** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_job_request_settings_motion_image_inserter import CreateJobRequestSettingsMotionImageInserter

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobRequestSettingsMotionImageInserter from a JSON string
create_job_request_settings_motion_image_inserter_instance = CreateJobRequestSettingsMotionImageInserter.from_json(json)
# print the JSON string representation of the object
print(CreateJobRequestSettingsMotionImageInserter.to_json())

# convert the object into a dict
create_job_request_settings_motion_image_inserter_dict = create_job_request_settings_motion_image_inserter_instance.to_dict()
# create an instance of CreateJobRequestSettingsMotionImageInserter from a dict
create_job_request_settings_motion_image_inserter_from_dict = CreateJobRequestSettingsMotionImageInserter.from_dict(create_job_request_settings_motion_image_inserter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



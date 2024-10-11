# UpdateWaveRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Wave description. | [optional] 
**name** | **str** | Wave name. | [optional] 
**wave_id** | **str** | Wave ID. | 

## Example

```python
from openapi_client.models.update_wave_request import UpdateWaveRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateWaveRequest from a JSON string
update_wave_request_instance = UpdateWaveRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateWaveRequest.to_json())

# convert the object into a dict
update_wave_request_dict = update_wave_request_instance.to_dict()
# create an instance of UpdateWaveRequest from a dict
update_wave_request_from_dict = UpdateWaveRequest.from_dict(update_wave_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



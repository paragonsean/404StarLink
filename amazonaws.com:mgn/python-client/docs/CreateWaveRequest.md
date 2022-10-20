# CreateWaveRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Wave description. | [optional] 
**name** | **str** | Wave name. | 
**tags** | **Dict[str, str]** | Wave tags. | [optional] 

## Example

```python
from openapi_client.models.create_wave_request import CreateWaveRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateWaveRequest from a JSON string
create_wave_request_instance = CreateWaveRequest.from_json(json)
# print the JSON string representation of the object
print(CreateWaveRequest.to_json())

# convert the object into a dict
create_wave_request_dict = create_wave_request_instance.to_dict()
# create an instance of CreateWaveRequest from a dict
create_wave_request_from_dict = CreateWaveRequest.from_dict(create_wave_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



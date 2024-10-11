# EndpointDemographic

Specifies demographic information about an endpoint, such as the applicable time zone and platform.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_version** | **str** |  | [optional] 
**locale** | **str** |  | [optional] 
**make** | **str** |  | [optional] 
**model** | **str** |  | [optional] 
**model_version** | **str** |  | [optional] 
**platform** | **str** |  | [optional] 
**platform_version** | **str** |  | [optional] 
**timezone** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.endpoint_demographic import EndpointDemographic

# TODO update the JSON string below
json = "{}"
# create an instance of EndpointDemographic from a JSON string
endpoint_demographic_instance = EndpointDemographic.from_json(json)
# print the JSON string representation of the object
print(EndpointDemographic.to_json())

# convert the object into a dict
endpoint_demographic_dict = endpoint_demographic_instance.to_dict()
# create an instance of EndpointDemographic from a dict
endpoint_demographic_from_dict = EndpointDemographic.from_dict(endpoint_demographic_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



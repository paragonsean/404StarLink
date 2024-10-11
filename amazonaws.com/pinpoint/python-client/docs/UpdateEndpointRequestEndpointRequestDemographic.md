# UpdateEndpointRequestEndpointRequestDemographic


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
from openapi_client.models.update_endpoint_request_endpoint_request_demographic import UpdateEndpointRequestEndpointRequestDemographic

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEndpointRequestEndpointRequestDemographic from a JSON string
update_endpoint_request_endpoint_request_demographic_instance = UpdateEndpointRequestEndpointRequestDemographic.from_json(json)
# print the JSON string representation of the object
print(UpdateEndpointRequestEndpointRequestDemographic.to_json())

# convert the object into a dict
update_endpoint_request_endpoint_request_demographic_dict = update_endpoint_request_endpoint_request_demographic_instance.to_dict()
# create an instance of UpdateEndpointRequestEndpointRequestDemographic from a dict
update_endpoint_request_endpoint_request_demographic_from_dict = UpdateEndpointRequestEndpointRequestDemographic.from_dict(update_endpoint_request_endpoint_request_demographic_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



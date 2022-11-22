# PutPositionConfigurationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**solvers** | [**PutPositionConfigurationRequestSolvers**](PutPositionConfigurationRequestSolvers.md) |  | [optional] 
**destination** | **str** | The position data destination that describes the AWS IoT rule that processes the device&#39;s position data for use by AWS IoT Core for LoRaWAN. | [optional] 

## Example

```python
from openapi_client.models.put_position_configuration_request import PutPositionConfigurationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PutPositionConfigurationRequest from a JSON string
put_position_configuration_request_instance = PutPositionConfigurationRequest.from_json(json)
# print the JSON string representation of the object
print(PutPositionConfigurationRequest.to_json())

# convert the object into a dict
put_position_configuration_request_dict = put_position_configuration_request_instance.to_dict()
# create an instance of PutPositionConfigurationRequest from a dict
put_position_configuration_request_from_dict = PutPositionConfigurationRequest.from_dict(put_position_configuration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



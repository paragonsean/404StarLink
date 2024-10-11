# ApplicationConfig

LoRaWAN application configuration, which can be used to perform geolocation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**f_port** | **int** | The Fport value. | [optional] 
**type** | [**ApplicationConfigType**](ApplicationConfigType.md) |  | [optional] 
**destination_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.application_config import ApplicationConfig

# TODO update the JSON string below
json = "{}"
# create an instance of ApplicationConfig from a JSON string
application_config_instance = ApplicationConfig.from_json(json)
# print the JSON string representation of the object
print(ApplicationConfig.to_json())

# convert the object into a dict
application_config_dict = application_config_instance.to_dict()
# create an instance of ApplicationConfig from a dict
application_config_from_dict = ApplicationConfig.from_dict(application_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ServiceDirectoryConfig

ServiceDirectoryConfig represents Service Directory configuration for a SCM host connection.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service** | **str** | The Service Directory service name. Format: projects/{project}/locations/{location}/namespaces/{namespace}/services/{service}. | [optional] 

## Example

```python
from openapi_client.models.service_directory_config import ServiceDirectoryConfig

# TODO update the JSON string below
json = "{}"
# create an instance of ServiceDirectoryConfig from a JSON string
service_directory_config_instance = ServiceDirectoryConfig.from_json(json)
# print the JSON string representation of the object
print(ServiceDirectoryConfig.to_json())

# convert the object into a dict
service_directory_config_dict = service_directory_config_instance.to_dict()
# create an instance of ServiceDirectoryConfig from a dict
service_directory_config_from_dict = ServiceDirectoryConfig.from_dict(service_directory_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



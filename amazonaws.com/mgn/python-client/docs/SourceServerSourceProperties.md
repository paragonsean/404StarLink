# SourceServerSourceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cpus** | **List** |  | [optional] 
**disks** | **List** |  | [optional] 
**identification_hints** | [**SourcePropertiesIdentificationHints**](SourcePropertiesIdentificationHints.md) |  | [optional] 
**last_updated_date_time** | **str** |  | [optional] 
**network_interfaces** | **List** |  | [optional] 
**os** | [**SourcePropertiesOs**](SourcePropertiesOs.md) |  | [optional] 
**ram_bytes** | **int** |  | [optional] 
**recommended_instance_type** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.source_server_source_properties import SourceServerSourceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of SourceServerSourceProperties from a JSON string
source_server_source_properties_instance = SourceServerSourceProperties.from_json(json)
# print the JSON string representation of the object
print(SourceServerSourceProperties.to_json())

# convert the object into a dict
source_server_source_properties_dict = source_server_source_properties_instance.to_dict()
# create an instance of SourceServerSourceProperties from a dict
source_server_source_properties_from_dict = SourceServerSourceProperties.from_dict(source_server_source_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



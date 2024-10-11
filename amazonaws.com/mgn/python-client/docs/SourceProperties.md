# SourceProperties

Source server properties.

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
from openapi_client.models.source_properties import SourceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of SourceProperties from a JSON string
source_properties_instance = SourceProperties.from_json(json)
# print the JSON string representation of the object
print(SourceProperties.to_json())

# convert the object into a dict
source_properties_dict = source_properties_instance.to_dict()
# create an instance of SourceProperties from a dict
source_properties_from_dict = SourceProperties.from_dict(source_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# SourcePropertiesIdentificationHints


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aws_instance_id** | **str** |  | [optional] 
**fqdn** | **str** |  | [optional] 
**hostname** | **str** |  | [optional] 
**vm_path** | **str** |  | [optional] 
**vm_ware_uuid** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.source_properties_identification_hints import SourcePropertiesIdentificationHints

# TODO update the JSON string below
json = "{}"
# create an instance of SourcePropertiesIdentificationHints from a JSON string
source_properties_identification_hints_instance = SourcePropertiesIdentificationHints.from_json(json)
# print the JSON string representation of the object
print(SourcePropertiesIdentificationHints.to_json())

# convert the object into a dict
source_properties_identification_hints_dict = source_properties_identification_hints_instance.to_dict()
# create an instance of SourcePropertiesIdentificationHints from a dict
source_properties_identification_hints_from_dict = SourcePropertiesIdentificationHints.from_dict(source_properties_identification_hints_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



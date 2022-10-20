# IdentificationHints

Identification hints.

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
from openapi_client.models.identification_hints import IdentificationHints

# TODO update the JSON string below
json = "{}"
# create an instance of IdentificationHints from a JSON string
identification_hints_instance = IdentificationHints.from_json(json)
# print the JSON string representation of the object
print(IdentificationHints.to_json())

# convert the object into a dict
identification_hints_dict = identification_hints_instance.to_dict()
# create an instance of IdentificationHints from a dict
identification_hints_from_dict = IdentificationHints.from_dict(identification_hints_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# MachineTranslatedStrings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cost** | [**Monetary**](Monetary.md) |  | [optional] 
**strings** | [**List[ClientStringWithTranslations]**](ClientStringWithTranslations.md) |  | [optional] 

## Example

```python
from openapi_client.models.machine_translated_strings import MachineTranslatedStrings

# TODO update the JSON string below
json = "{}"
# create an instance of MachineTranslatedStrings from a JSON string
machine_translated_strings_instance = MachineTranslatedStrings.from_json(json)
# print the JSON string representation of the object
print(MachineTranslatedStrings.to_json())

# convert the object into a dict
machine_translated_strings_dict = machine_translated_strings_instance.to_dict()
# create an instance of MachineTranslatedStrings from a dict
machine_translated_strings_from_dict = MachineTranslatedStrings.from_dict(machine_translated_strings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ProcessingConfiguration

Describes a data processing configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 
**processors** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.processing_configuration import ProcessingConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of ProcessingConfiguration from a JSON string
processing_configuration_instance = ProcessingConfiguration.from_json(json)
# print the JSON string representation of the object
print(ProcessingConfiguration.to_json())

# convert the object into a dict
processing_configuration_dict = processing_configuration_instance.to_dict()
# create an instance of ProcessingConfiguration from a dict
processing_configuration_from_dict = ProcessingConfiguration.from_dict(processing_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



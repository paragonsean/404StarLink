# LendingSummary

Contains information regarding DocumentGroups and UndetectedDocumentTypes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_groups** | **List** |  | [optional] 
**undetected_document_types** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.lending_summary import LendingSummary

# TODO update the JSON string below
json = "{}"
# create an instance of LendingSummary from a JSON string
lending_summary_instance = LendingSummary.from_json(json)
# print the JSON string representation of the object
print(LendingSummary.to_json())

# convert the object into a dict
lending_summary_dict = lending_summary_instance.to_dict()
# create an instance of LendingSummary from a dict
lending_summary_from_dict = LendingSummary.from_dict(lending_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



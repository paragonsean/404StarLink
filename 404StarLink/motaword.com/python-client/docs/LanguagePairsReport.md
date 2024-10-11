# LanguagePairsReport


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**PagingMeta**](PagingMeta.md) |  | [optional] 
**report** | [**List[LanguagePairsReportReportInner]**](LanguagePairsReportReportInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.language_pairs_report import LanguagePairsReport

# TODO update the JSON string below
json = "{}"
# create an instance of LanguagePairsReport from a JSON string
language_pairs_report_instance = LanguagePairsReport.from_json(json)
# print the JSON string representation of the object
print(LanguagePairsReport.to_json())

# convert the object into a dict
language_pairs_report_dict = language_pairs_report_instance.to_dict()
# create an instance of LanguagePairsReport from a dict
language_pairs_report_from_dict = LanguagePairsReport.from_dict(language_pairs_report_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



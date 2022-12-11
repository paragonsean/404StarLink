# LanguagePairsReportReportInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language_pair** | [**LanguagePairsReportReportInnerLanguagePair**](LanguagePairsReportReportInnerLanguagePair.md) |  | [optional] 
**spending** | **float** |  | [optional] 
**word_count** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.language_pairs_report_report_inner import LanguagePairsReportReportInner

# TODO update the JSON string below
json = "{}"
# create an instance of LanguagePairsReportReportInner from a JSON string
language_pairs_report_report_inner_instance = LanguagePairsReportReportInner.from_json(json)
# print the JSON string representation of the object
print(LanguagePairsReportReportInner.to_json())

# convert the object into a dict
language_pairs_report_report_inner_dict = language_pairs_report_report_inner_instance.to_dict()
# create an instance of LanguagePairsReportReportInner from a dict
language_pairs_report_report_inner_from_dict = LanguagePairsReportReportInner.from_dict(language_pairs_report_report_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



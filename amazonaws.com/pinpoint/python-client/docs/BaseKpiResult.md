# BaseKpiResult

Provides the results of a query that retrieved the data for a standard metric that applies to an application, campaign, or journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rows** | **List** |  | 

## Example

```python
from openapi_client.models.base_kpi_result import BaseKpiResult

# TODO update the JSON string below
json = "{}"
# create an instance of BaseKpiResult from a JSON string
base_kpi_result_instance = BaseKpiResult.from_json(json)
# print the JSON string representation of the object
print(BaseKpiResult.to_json())

# convert the object into a dict
base_kpi_result_dict = base_kpi_result_instance.to_dict()
# create an instance of BaseKpiResult from a dict
base_kpi_result_from_dict = BaseKpiResult.from_dict(base_kpi_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



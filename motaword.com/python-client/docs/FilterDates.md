# FilterDates


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**date_to** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 

## Example

```python
from openapi_client.models.filter_dates import FilterDates

# TODO update the JSON string below
json = "{}"
# create an instance of FilterDates from a JSON string
filter_dates_instance = FilterDates.from_json(json)
# print the JSON string representation of the object
print(FilterDates.to_json())

# convert the object into a dict
filter_dates_dict = filter_dates_instance.to_dict()
# create an instance of FilterDates from a dict
filter_dates_from_dict = FilterDates.from_dict(filter_dates_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



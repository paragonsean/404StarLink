# coding: utf-8

"""
    Migration Center API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.report_summary_histogram_chart_data_bucket import ReportSummaryHistogramChartDataBucket
from typing import Optional, Set
from typing_extensions import Self

class ReportSummaryHistogramChartData(BaseModel):
    """
    A Histogram Chart shows a distribution of values into buckets, showing a count of values which fall into a bucket.
    """ # noqa: E501
    buckets: Optional[List[ReportSummaryHistogramChartDataBucket]] = Field(default=None, description="Buckets in the histogram. There will be `n+1` buckets matching `n` lower bounds in the request. The first bucket will be from -infinity to the first bound. Subsequent buckets will be between one bound and the next. The final bucket will be from the final bound to infinity.")
    __properties: ClassVar[List[str]] = ["buckets"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of ReportSummaryHistogramChartData from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in buckets (list)
        _items = []
        if self.buckets:
            for _item_buckets in self.buckets:
                if _item_buckets:
                    _items.append(_item_buckets.to_dict())
            _dict['buckets'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ReportSummaryHistogramChartData from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "buckets": [ReportSummaryHistogramChartDataBucket.from_dict(_item) for _item in obj["buckets"]] if obj.get("buckets") is not None else None
        })
        return _obj



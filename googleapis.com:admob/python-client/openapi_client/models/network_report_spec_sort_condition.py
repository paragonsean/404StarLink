# coding: utf-8

"""
    AdMob API

    The AdMob API allows publishers to programmatically get information about their AdMob account. 

    The version of the OpenAPI document: v1beta
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class NetworkReportSpecSortCondition(BaseModel):
    """
    Sorting direction to be applied on a dimension or a metric.
    """ # noqa: E501
    dimension: Optional[StrictStr] = Field(default=None, description="Sort by the specified dimension.")
    metric: Optional[StrictStr] = Field(default=None, description="Sort by the specified metric.")
    order: Optional[StrictStr] = Field(default=None, description="Sorting order of the dimension or metric.")
    __properties: ClassVar[List[str]] = ["dimension", "metric", "order"]

    @field_validator('dimension')
    def dimension_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['DIMENSION_UNSPECIFIED', 'DATE', 'MONTH', 'WEEK', 'AD_UNIT', 'APP', 'AD_TYPE', 'COUNTRY', 'FORMAT', 'PLATFORM', 'MOBILE_OS_VERSION', 'GMA_SDK_VERSION', 'APP_VERSION_NAME', 'SERVING_RESTRICTION']):
            raise ValueError("must be one of enum values ('DIMENSION_UNSPECIFIED', 'DATE', 'MONTH', 'WEEK', 'AD_UNIT', 'APP', 'AD_TYPE', 'COUNTRY', 'FORMAT', 'PLATFORM', 'MOBILE_OS_VERSION', 'GMA_SDK_VERSION', 'APP_VERSION_NAME', 'SERVING_RESTRICTION')")
        return value

    @field_validator('metric')
    def metric_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['METRIC_UNSPECIFIED', 'AD_REQUESTS', 'CLICKS', 'ESTIMATED_EARNINGS', 'IMPRESSIONS', 'IMPRESSION_CTR', 'IMPRESSION_RPM', 'MATCHED_REQUESTS', 'MATCH_RATE', 'SHOW_RATE']):
            raise ValueError("must be one of enum values ('METRIC_UNSPECIFIED', 'AD_REQUESTS', 'CLICKS', 'ESTIMATED_EARNINGS', 'IMPRESSIONS', 'IMPRESSION_CTR', 'IMPRESSION_RPM', 'MATCHED_REQUESTS', 'MATCH_RATE', 'SHOW_RATE')")
        return value

    @field_validator('order')
    def order_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['SORT_ORDER_UNSPECIFIED', 'ASCENDING', 'DESCENDING']):
            raise ValueError("must be one of enum values ('SORT_ORDER_UNSPECIFIED', 'ASCENDING', 'DESCENDING')")
        return value

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
        """Create an instance of NetworkReportSpecSortCondition from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of NetworkReportSpecSortCondition from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "dimension": obj.get("dimension"),
            "metric": obj.get("metric"),
            "order": obj.get("order")
        })
        return _obj



# coding: utf-8

"""
    Cloud Spanner API

    Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional, Union
from openapi_client.models.derived_metric import DerivedMetric
from openapi_client.models.indexed_hot_key import IndexedHotKey
from openapi_client.models.indexed_key_range_infos import IndexedKeyRangeInfos
from openapi_client.models.localized_string import LocalizedString
from openapi_client.models.metric_matrix import MetricMatrix
from typing import Optional, Set
from typing_extensions import Self

class Metric(BaseModel):
    """
    A message representing the actual monitoring data, values for each key bucket over time, of a metric.
    """ # noqa: E501
    aggregation: Optional[StrictStr] = Field(default=None, description="The aggregation function used to aggregate each key bucket")
    category: Optional[LocalizedString] = None
    derived: Optional[DerivedMetric] = None
    display_label: Optional[LocalizedString] = Field(default=None, alias="displayLabel")
    has_nonzero_data: Optional[StrictBool] = Field(default=None, description="Whether the metric has any non-zero data.", alias="hasNonzeroData")
    hot_value: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="The value that is considered hot for the metric. On a per metric basis hotness signals high utilization and something that might potentially be a cause for concern by the end user. hot_value is used to calibrate and scale visual color scales.", alias="hotValue")
    indexed_hot_keys: Optional[Dict[str, IndexedHotKey]] = Field(default=None, description="The (sparse) mapping from time index to an IndexedHotKey message, representing those time intervals for which there are hot keys.", alias="indexedHotKeys")
    indexed_key_range_infos: Optional[Dict[str, IndexedKeyRangeInfos]] = Field(default=None, description="The (sparse) mapping from time interval index to an IndexedKeyRangeInfos message, representing those time intervals for which there are informational messages concerning key ranges.", alias="indexedKeyRangeInfos")
    info: Optional[LocalizedString] = None
    matrix: Optional[MetricMatrix] = None
    unit: Optional[LocalizedString] = None
    visible: Optional[StrictBool] = Field(default=None, description="Whether the metric is visible to the end user.")
    __properties: ClassVar[List[str]] = ["aggregation", "category", "derived", "displayLabel", "hasNonzeroData", "hotValue", "indexedHotKeys", "indexedKeyRangeInfos", "info", "matrix", "unit", "visible"]

    @field_validator('aggregation')
    def aggregation_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['AGGREGATION_UNSPECIFIED', 'MAX', 'SUM']):
            raise ValueError("must be one of enum values ('AGGREGATION_UNSPECIFIED', 'MAX', 'SUM')")
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
        """Create an instance of Metric from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of category
        if self.category:
            _dict['category'] = self.category.to_dict()
        # override the default output from pydantic by calling `to_dict()` of derived
        if self.derived:
            _dict['derived'] = self.derived.to_dict()
        # override the default output from pydantic by calling `to_dict()` of display_label
        if self.display_label:
            _dict['displayLabel'] = self.display_label.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each value in indexed_hot_keys (dict)
        _field_dict = {}
        if self.indexed_hot_keys:
            for _key_indexed_hot_keys in self.indexed_hot_keys:
                if self.indexed_hot_keys[_key_indexed_hot_keys]:
                    _field_dict[_key_indexed_hot_keys] = self.indexed_hot_keys[_key_indexed_hot_keys].to_dict()
            _dict['indexedHotKeys'] = _field_dict
        # override the default output from pydantic by calling `to_dict()` of each value in indexed_key_range_infos (dict)
        _field_dict = {}
        if self.indexed_key_range_infos:
            for _key_indexed_key_range_infos in self.indexed_key_range_infos:
                if self.indexed_key_range_infos[_key_indexed_key_range_infos]:
                    _field_dict[_key_indexed_key_range_infos] = self.indexed_key_range_infos[_key_indexed_key_range_infos].to_dict()
            _dict['indexedKeyRangeInfos'] = _field_dict
        # override the default output from pydantic by calling `to_dict()` of info
        if self.info:
            _dict['info'] = self.info.to_dict()
        # override the default output from pydantic by calling `to_dict()` of matrix
        if self.matrix:
            _dict['matrix'] = self.matrix.to_dict()
        # override the default output from pydantic by calling `to_dict()` of unit
        if self.unit:
            _dict['unit'] = self.unit.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Metric from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "aggregation": obj.get("aggregation"),
            "category": LocalizedString.from_dict(obj["category"]) if obj.get("category") is not None else None,
            "derived": DerivedMetric.from_dict(obj["derived"]) if obj.get("derived") is not None else None,
            "displayLabel": LocalizedString.from_dict(obj["displayLabel"]) if obj.get("displayLabel") is not None else None,
            "hasNonzeroData": obj.get("hasNonzeroData"),
            "hotValue": obj.get("hotValue"),
            "indexedHotKeys": dict(
                (_k, IndexedHotKey.from_dict(_v))
                for _k, _v in obj["indexedHotKeys"].items()
            )
            if obj.get("indexedHotKeys") is not None
            else None,
            "indexedKeyRangeInfos": dict(
                (_k, IndexedKeyRangeInfos.from_dict(_v))
                for _k, _v in obj["indexedKeyRangeInfos"].items()
            )
            if obj.get("indexedKeyRangeInfos") is not None
            else None,
            "info": LocalizedString.from_dict(obj["info"]) if obj.get("info") is not None else None,
            "matrix": MetricMatrix.from_dict(obj["matrix"]) if obj.get("matrix") is not None else None,
            "unit": LocalizedString.from_dict(obj["unit"]) if obj.get("unit") is not None else None,
            "visible": obj.get("visible")
        })
        return _obj



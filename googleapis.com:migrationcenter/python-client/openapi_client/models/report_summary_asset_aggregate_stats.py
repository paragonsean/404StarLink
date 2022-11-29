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

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.report_summary_chart_data import ReportSummaryChartData
from openapi_client.models.report_summary_histogram_chart_data import ReportSummaryHistogramChartData
from openapi_client.models.report_summary_utilization_chart_data import ReportSummaryUtilizationChartData
from typing import Optional, Set
from typing_extensions import Self

class ReportSummaryAssetAggregateStats(BaseModel):
    """
    Aggregate statistics for a collection of assets.
    """ # noqa: E501
    asset_age: Optional[ReportSummaryChartData] = Field(default=None, alias="assetAge")
    core_count_histogram: Optional[ReportSummaryHistogramChartData] = Field(default=None, alias="coreCountHistogram")
    memory_bytes_histogram: Optional[ReportSummaryHistogramChartData] = Field(default=None, alias="memoryBytesHistogram")
    memory_utilization: Optional[ReportSummaryChartData] = Field(default=None, alias="memoryUtilization")
    memory_utilization_chart: Optional[ReportSummaryUtilizationChartData] = Field(default=None, alias="memoryUtilizationChart")
    operating_system: Optional[ReportSummaryChartData] = Field(default=None, alias="operatingSystem")
    storage_bytes_histogram: Optional[ReportSummaryHistogramChartData] = Field(default=None, alias="storageBytesHistogram")
    storage_utilization: Optional[ReportSummaryChartData] = Field(default=None, alias="storageUtilization")
    storage_utilization_chart: Optional[ReportSummaryUtilizationChartData] = Field(default=None, alias="storageUtilizationChart")
    total_assets: Optional[StrictStr] = Field(default=None, description="Count of the number of unique assets in this collection.", alias="totalAssets")
    total_cores: Optional[StrictStr] = Field(default=None, description="Sum of the CPU core count of all the assets in this collection.", alias="totalCores")
    total_memory_bytes: Optional[StrictStr] = Field(default=None, description="Sum of the memory in bytes of all the assets in this collection.", alias="totalMemoryBytes")
    total_storage_bytes: Optional[StrictStr] = Field(default=None, description="Sum of persistent storage in bytes of all the assets in this collection.", alias="totalStorageBytes")
    __properties: ClassVar[List[str]] = ["assetAge", "coreCountHistogram", "memoryBytesHistogram", "memoryUtilization", "memoryUtilizationChart", "operatingSystem", "storageBytesHistogram", "storageUtilization", "storageUtilizationChart", "totalAssets", "totalCores", "totalMemoryBytes", "totalStorageBytes"]

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
        """Create an instance of ReportSummaryAssetAggregateStats from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of asset_age
        if self.asset_age:
            _dict['assetAge'] = self.asset_age.to_dict()
        # override the default output from pydantic by calling `to_dict()` of core_count_histogram
        if self.core_count_histogram:
            _dict['coreCountHistogram'] = self.core_count_histogram.to_dict()
        # override the default output from pydantic by calling `to_dict()` of memory_bytes_histogram
        if self.memory_bytes_histogram:
            _dict['memoryBytesHistogram'] = self.memory_bytes_histogram.to_dict()
        # override the default output from pydantic by calling `to_dict()` of memory_utilization
        if self.memory_utilization:
            _dict['memoryUtilization'] = self.memory_utilization.to_dict()
        # override the default output from pydantic by calling `to_dict()` of memory_utilization_chart
        if self.memory_utilization_chart:
            _dict['memoryUtilizationChart'] = self.memory_utilization_chart.to_dict()
        # override the default output from pydantic by calling `to_dict()` of operating_system
        if self.operating_system:
            _dict['operatingSystem'] = self.operating_system.to_dict()
        # override the default output from pydantic by calling `to_dict()` of storage_bytes_histogram
        if self.storage_bytes_histogram:
            _dict['storageBytesHistogram'] = self.storage_bytes_histogram.to_dict()
        # override the default output from pydantic by calling `to_dict()` of storage_utilization
        if self.storage_utilization:
            _dict['storageUtilization'] = self.storage_utilization.to_dict()
        # override the default output from pydantic by calling `to_dict()` of storage_utilization_chart
        if self.storage_utilization_chart:
            _dict['storageUtilizationChart'] = self.storage_utilization_chart.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ReportSummaryAssetAggregateStats from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "assetAge": ReportSummaryChartData.from_dict(obj["assetAge"]) if obj.get("assetAge") is not None else None,
            "coreCountHistogram": ReportSummaryHistogramChartData.from_dict(obj["coreCountHistogram"]) if obj.get("coreCountHistogram") is not None else None,
            "memoryBytesHistogram": ReportSummaryHistogramChartData.from_dict(obj["memoryBytesHistogram"]) if obj.get("memoryBytesHistogram") is not None else None,
            "memoryUtilization": ReportSummaryChartData.from_dict(obj["memoryUtilization"]) if obj.get("memoryUtilization") is not None else None,
            "memoryUtilizationChart": ReportSummaryUtilizationChartData.from_dict(obj["memoryUtilizationChart"]) if obj.get("memoryUtilizationChart") is not None else None,
            "operatingSystem": ReportSummaryChartData.from_dict(obj["operatingSystem"]) if obj.get("operatingSystem") is not None else None,
            "storageBytesHistogram": ReportSummaryHistogramChartData.from_dict(obj["storageBytesHistogram"]) if obj.get("storageBytesHistogram") is not None else None,
            "storageUtilization": ReportSummaryChartData.from_dict(obj["storageUtilization"]) if obj.get("storageUtilization") is not None else None,
            "storageUtilizationChart": ReportSummaryUtilizationChartData.from_dict(obj["storageUtilizationChart"]) if obj.get("storageUtilizationChart") is not None else None,
            "totalAssets": obj.get("totalAssets"),
            "totalCores": obj.get("totalCores"),
            "totalMemoryBytes": obj.get("totalMemoryBytes"),
            "totalStorageBytes": obj.get("totalStorageBytes")
        })
        return _obj



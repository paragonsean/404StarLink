# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class AudioNormalizationSettings(BaseModel):
    """
    Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness standard.
    """ # noqa: E501
    algorithm: Optional[Any] = Field(default=None, alias="Algorithm")
    algorithm_control: Optional[Any] = Field(default=None, alias="AlgorithmControl")
    correction_gate_level: Optional[Any] = Field(default=None, alias="CorrectionGateLevel")
    loudness_logging: Optional[Any] = Field(default=None, alias="LoudnessLogging")
    peak_calculation: Optional[Any] = Field(default=None, alias="PeakCalculation")
    target_lkfs: Optional[Any] = Field(default=None, alias="TargetLkfs")
    true_peak_limiter_threshold: Optional[Any] = Field(default=None, alias="TruePeakLimiterThreshold")
    __properties: ClassVar[List[str]] = ["Algorithm", "AlgorithmControl", "CorrectionGateLevel", "LoudnessLogging", "PeakCalculation", "TargetLkfs", "TruePeakLimiterThreshold"]

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
        """Create an instance of AudioNormalizationSettings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of algorithm
        if self.algorithm:
            _dict['Algorithm'] = self.algorithm.to_dict()
        # override the default output from pydantic by calling `to_dict()` of algorithm_control
        if self.algorithm_control:
            _dict['AlgorithmControl'] = self.algorithm_control.to_dict()
        # override the default output from pydantic by calling `to_dict()` of loudness_logging
        if self.loudness_logging:
            _dict['LoudnessLogging'] = self.loudness_logging.to_dict()
        # override the default output from pydantic by calling `to_dict()` of peak_calculation
        if self.peak_calculation:
            _dict['PeakCalculation'] = self.peak_calculation.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AudioNormalizationSettings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Algorithm": AudioNormalizationAlgorithm.from_dict(obj["Algorithm"]) if obj.get("Algorithm") is not None else None,
            "AlgorithmControl": AudioNormalizationAlgorithmControl.from_dict(obj["AlgorithmControl"]) if obj.get("AlgorithmControl") is not None else None,
            "CorrectionGateLevel": obj.get("CorrectionGateLevel"),
            "LoudnessLogging": AudioNormalizationLoudnessLogging.from_dict(obj["LoudnessLogging"]) if obj.get("LoudnessLogging") is not None else None,
            "PeakCalculation": AudioNormalizationPeakCalculation.from_dict(obj["PeakCalculation"]) if obj.get("PeakCalculation") is not None else None,
            "TargetLkfs": obj.get("TargetLkfs"),
            "TruePeakLimiterThreshold": obj.get("TruePeakLimiterThreshold")
        })
        return _obj



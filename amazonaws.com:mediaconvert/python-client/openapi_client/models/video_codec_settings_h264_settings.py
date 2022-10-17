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
from openapi_client.models.float import float
from openapi_client.models.h264_adaptive_quantization import H264AdaptiveQuantization
from openapi_client.models.h264_codec_level import H264CodecLevel
from openapi_client.models.h264_codec_profile import H264CodecProfile
from openapi_client.models.h264_dynamic_sub_gop import H264DynamicSubGop
from openapi_client.models.h264_entropy_encoding import H264EntropyEncoding
from openapi_client.models.h264_field_encoding import H264FieldEncoding
from openapi_client.models.h264_flicker_adaptive_quantization import H264FlickerAdaptiveQuantization
from openapi_client.models.h264_framerate_control import H264FramerateControl
from openapi_client.models.h264_framerate_conversion_algorithm import H264FramerateConversionAlgorithm
from openapi_client.models.h264_gop_b_reference import H264GopBReference
from openapi_client.models.h264_gop_size_units import H264GopSizeUnits
from openapi_client.models.h264_interlace_mode import H264InterlaceMode
from openapi_client.models.h264_par_control import H264ParControl
from openapi_client.models.h264_quality_tuning_level import H264QualityTuningLevel
from openapi_client.models.h264_rate_control_mode import H264RateControlMode
from openapi_client.models.h264_repeat_pps import H264RepeatPps
from openapi_client.models.h264_scan_type_conversion_mode import H264ScanTypeConversionMode
from openapi_client.models.h264_scene_change_detect import H264SceneChangeDetect
from openapi_client.models.h264_settings_bandwidth_reduction_filter import H264SettingsBandwidthReductionFilter
from openapi_client.models.h264_settings_qvbr_settings import H264SettingsQvbrSettings
from openapi_client.models.h264_slow_pal import H264SlowPal
from openapi_client.models.h264_spatial_adaptive_quantization import H264SpatialAdaptiveQuantization
from openapi_client.models.h264_syntax import H264Syntax
from openapi_client.models.h264_telecine import H264Telecine
from openapi_client.models.h264_temporal_adaptive_quantization import H264TemporalAdaptiveQuantization
from openapi_client.models.h264_unregistered_sei_timecode import H264UnregisteredSeiTimecode
from openapi_client.models.int import int
from typing import Optional, Set
from typing_extensions import Self

class VideoCodecSettingsH264Settings(BaseModel):
    """
    VideoCodecSettingsH264Settings
    """ # noqa: E501
    adaptive_quantization: Optional[Any] = Field(default=None, alias="AdaptiveQuantization")
    bandwidth_reduction_filter: Optional[H264SettingsBandwidthReductionFilter] = Field(default=None, alias="BandwidthReductionFilter")
    bitrate: Optional[Any] = Field(default=None, alias="Bitrate")
    codec_level: Optional[Any] = Field(default=None, alias="CodecLevel")
    codec_profile: Optional[Any] = Field(default=None, alias="CodecProfile")
    dynamic_sub_gop: Optional[Any] = Field(default=None, alias="DynamicSubGop")
    entropy_encoding: Optional[Any] = Field(default=None, alias="EntropyEncoding")
    field_encoding: Optional[Any] = Field(default=None, alias="FieldEncoding")
    flicker_adaptive_quantization: Optional[Any] = Field(default=None, alias="FlickerAdaptiveQuantization")
    framerate_control: Optional[Any] = Field(default=None, alias="FramerateControl")
    framerate_conversion_algorithm: Optional[Any] = Field(default=None, alias="FramerateConversionAlgorithm")
    framerate_denominator: Optional[Any] = Field(default=None, alias="FramerateDenominator")
    framerate_numerator: Optional[Any] = Field(default=None, alias="FramerateNumerator")
    gop_b_reference: Optional[Any] = Field(default=None, alias="GopBReference")
    gop_closed_cadence: Optional[Any] = Field(default=None, alias="GopClosedCadence")
    gop_size: Optional[Any] = Field(default=None, alias="GopSize")
    gop_size_units: Optional[Any] = Field(default=None, alias="GopSizeUnits")
    hrd_buffer_final_fill_percentage: Optional[Any] = Field(default=None, alias="HrdBufferFinalFillPercentage")
    hrd_buffer_initial_fill_percentage: Optional[Any] = Field(default=None, alias="HrdBufferInitialFillPercentage")
    hrd_buffer_size: Optional[Any] = Field(default=None, alias="HrdBufferSize")
    interlace_mode: Optional[Any] = Field(default=None, alias="InterlaceMode")
    max_bitrate: Optional[Any] = Field(default=None, alias="MaxBitrate")
    min_i_interval: Optional[Any] = Field(default=None, alias="MinIInterval")
    number_b_frames_between_reference_frames: Optional[Any] = Field(default=None, alias="NumberBFramesBetweenReferenceFrames")
    number_reference_frames: Optional[Any] = Field(default=None, alias="NumberReferenceFrames")
    par_control: Optional[Any] = Field(default=None, alias="ParControl")
    par_denominator: Optional[Any] = Field(default=None, alias="ParDenominator")
    par_numerator: Optional[Any] = Field(default=None, alias="ParNumerator")
    quality_tuning_level: Optional[Any] = Field(default=None, alias="QualityTuningLevel")
    qvbr_settings: Optional[H264SettingsQvbrSettings] = Field(default=None, alias="QvbrSettings")
    rate_control_mode: Optional[Any] = Field(default=None, alias="RateControlMode")
    repeat_pps: Optional[Any] = Field(default=None, alias="RepeatPps")
    scan_type_conversion_mode: Optional[Any] = Field(default=None, alias="ScanTypeConversionMode")
    scene_change_detect: Optional[Any] = Field(default=None, alias="SceneChangeDetect")
    slices: Optional[Any] = Field(default=None, alias="Slices")
    slow_pal: Optional[Any] = Field(default=None, alias="SlowPal")
    softness: Optional[Any] = Field(default=None, alias="Softness")
    spatial_adaptive_quantization: Optional[Any] = Field(default=None, alias="SpatialAdaptiveQuantization")
    syntax: Optional[Any] = Field(default=None, alias="Syntax")
    telecine: Optional[Any] = Field(default=None, alias="Telecine")
    temporal_adaptive_quantization: Optional[Any] = Field(default=None, alias="TemporalAdaptiveQuantization")
    unregistered_sei_timecode: Optional[Any] = Field(default=None, alias="UnregisteredSeiTimecode")
    __properties: ClassVar[List[str]] = ["AdaptiveQuantization", "BandwidthReductionFilter", "Bitrate", "CodecLevel", "CodecProfile", "DynamicSubGop", "EntropyEncoding", "FieldEncoding", "FlickerAdaptiveQuantization", "FramerateControl", "FramerateConversionAlgorithm", "FramerateDenominator", "FramerateNumerator", "GopBReference", "GopClosedCadence", "GopSize", "GopSizeUnits", "HrdBufferFinalFillPercentage", "HrdBufferInitialFillPercentage", "HrdBufferSize", "InterlaceMode", "MaxBitrate", "MinIInterval", "NumberBFramesBetweenReferenceFrames", "NumberReferenceFrames", "ParControl", "ParDenominator", "ParNumerator", "QualityTuningLevel", "QvbrSettings", "RateControlMode", "RepeatPps", "ScanTypeConversionMode", "SceneChangeDetect", "Slices", "SlowPal", "Softness", "SpatialAdaptiveQuantization", "Syntax", "Telecine", "TemporalAdaptiveQuantization", "UnregisteredSeiTimecode"]

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
        """Create an instance of VideoCodecSettingsH264Settings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of adaptive_quantization
        if self.adaptive_quantization:
            _dict['AdaptiveQuantization'] = self.adaptive_quantization.to_dict()
        # override the default output from pydantic by calling `to_dict()` of bandwidth_reduction_filter
        if self.bandwidth_reduction_filter:
            _dict['BandwidthReductionFilter'] = self.bandwidth_reduction_filter.to_dict()
        # override the default output from pydantic by calling `to_dict()` of codec_level
        if self.codec_level:
            _dict['CodecLevel'] = self.codec_level.to_dict()
        # override the default output from pydantic by calling `to_dict()` of codec_profile
        if self.codec_profile:
            _dict['CodecProfile'] = self.codec_profile.to_dict()
        # override the default output from pydantic by calling `to_dict()` of dynamic_sub_gop
        if self.dynamic_sub_gop:
            _dict['DynamicSubGop'] = self.dynamic_sub_gop.to_dict()
        # override the default output from pydantic by calling `to_dict()` of entropy_encoding
        if self.entropy_encoding:
            _dict['EntropyEncoding'] = self.entropy_encoding.to_dict()
        # override the default output from pydantic by calling `to_dict()` of field_encoding
        if self.field_encoding:
            _dict['FieldEncoding'] = self.field_encoding.to_dict()
        # override the default output from pydantic by calling `to_dict()` of flicker_adaptive_quantization
        if self.flicker_adaptive_quantization:
            _dict['FlickerAdaptiveQuantization'] = self.flicker_adaptive_quantization.to_dict()
        # override the default output from pydantic by calling `to_dict()` of framerate_control
        if self.framerate_control:
            _dict['FramerateControl'] = self.framerate_control.to_dict()
        # override the default output from pydantic by calling `to_dict()` of framerate_conversion_algorithm
        if self.framerate_conversion_algorithm:
            _dict['FramerateConversionAlgorithm'] = self.framerate_conversion_algorithm.to_dict()
        # override the default output from pydantic by calling `to_dict()` of gop_b_reference
        if self.gop_b_reference:
            _dict['GopBReference'] = self.gop_b_reference.to_dict()
        # override the default output from pydantic by calling `to_dict()` of gop_size_units
        if self.gop_size_units:
            _dict['GopSizeUnits'] = self.gop_size_units.to_dict()
        # override the default output from pydantic by calling `to_dict()` of interlace_mode
        if self.interlace_mode:
            _dict['InterlaceMode'] = self.interlace_mode.to_dict()
        # override the default output from pydantic by calling `to_dict()` of par_control
        if self.par_control:
            _dict['ParControl'] = self.par_control.to_dict()
        # override the default output from pydantic by calling `to_dict()` of quality_tuning_level
        if self.quality_tuning_level:
            _dict['QualityTuningLevel'] = self.quality_tuning_level.to_dict()
        # override the default output from pydantic by calling `to_dict()` of qvbr_settings
        if self.qvbr_settings:
            _dict['QvbrSettings'] = self.qvbr_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of rate_control_mode
        if self.rate_control_mode:
            _dict['RateControlMode'] = self.rate_control_mode.to_dict()
        # override the default output from pydantic by calling `to_dict()` of repeat_pps
        if self.repeat_pps:
            _dict['RepeatPps'] = self.repeat_pps.to_dict()
        # override the default output from pydantic by calling `to_dict()` of scan_type_conversion_mode
        if self.scan_type_conversion_mode:
            _dict['ScanTypeConversionMode'] = self.scan_type_conversion_mode.to_dict()
        # override the default output from pydantic by calling `to_dict()` of scene_change_detect
        if self.scene_change_detect:
            _dict['SceneChangeDetect'] = self.scene_change_detect.to_dict()
        # override the default output from pydantic by calling `to_dict()` of slow_pal
        if self.slow_pal:
            _dict['SlowPal'] = self.slow_pal.to_dict()
        # override the default output from pydantic by calling `to_dict()` of spatial_adaptive_quantization
        if self.spatial_adaptive_quantization:
            _dict['SpatialAdaptiveQuantization'] = self.spatial_adaptive_quantization.to_dict()
        # override the default output from pydantic by calling `to_dict()` of syntax
        if self.syntax:
            _dict['Syntax'] = self.syntax.to_dict()
        # override the default output from pydantic by calling `to_dict()` of telecine
        if self.telecine:
            _dict['Telecine'] = self.telecine.to_dict()
        # override the default output from pydantic by calling `to_dict()` of temporal_adaptive_quantization
        if self.temporal_adaptive_quantization:
            _dict['TemporalAdaptiveQuantization'] = self.temporal_adaptive_quantization.to_dict()
        # override the default output from pydantic by calling `to_dict()` of unregistered_sei_timecode
        if self.unregistered_sei_timecode:
            _dict['UnregisteredSeiTimecode'] = self.unregistered_sei_timecode.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of VideoCodecSettingsH264Settings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "AdaptiveQuantization": H264AdaptiveQuantization.from_dict(obj["AdaptiveQuantization"]) if obj.get("AdaptiveQuantization") is not None else None,
            "BandwidthReductionFilter": H264SettingsBandwidthReductionFilter.from_dict(obj["BandwidthReductionFilter"]) if obj.get("BandwidthReductionFilter") is not None else None,
            "Bitrate": obj.get("Bitrate"),
            "CodecLevel": H264CodecLevel.from_dict(obj["CodecLevel"]) if obj.get("CodecLevel") is not None else None,
            "CodecProfile": H264CodecProfile.from_dict(obj["CodecProfile"]) if obj.get("CodecProfile") is not None else None,
            "DynamicSubGop": H264DynamicSubGop.from_dict(obj["DynamicSubGop"]) if obj.get("DynamicSubGop") is not None else None,
            "EntropyEncoding": H264EntropyEncoding.from_dict(obj["EntropyEncoding"]) if obj.get("EntropyEncoding") is not None else None,
            "FieldEncoding": H264FieldEncoding.from_dict(obj["FieldEncoding"]) if obj.get("FieldEncoding") is not None else None,
            "FlickerAdaptiveQuantization": H264FlickerAdaptiveQuantization.from_dict(obj["FlickerAdaptiveQuantization"]) if obj.get("FlickerAdaptiveQuantization") is not None else None,
            "FramerateControl": H264FramerateControl.from_dict(obj["FramerateControl"]) if obj.get("FramerateControl") is not None else None,
            "FramerateConversionAlgorithm": H264FramerateConversionAlgorithm.from_dict(obj["FramerateConversionAlgorithm"]) if obj.get("FramerateConversionAlgorithm") is not None else None,
            "FramerateDenominator": obj.get("FramerateDenominator"),
            "FramerateNumerator": obj.get("FramerateNumerator"),
            "GopBReference": H264GopBReference.from_dict(obj["GopBReference"]) if obj.get("GopBReference") is not None else None,
            "GopClosedCadence": obj.get("GopClosedCadence"),
            "GopSize": obj.get("GopSize"),
            "GopSizeUnits": H264GopSizeUnits.from_dict(obj["GopSizeUnits"]) if obj.get("GopSizeUnits") is not None else None,
            "HrdBufferFinalFillPercentage": obj.get("HrdBufferFinalFillPercentage"),
            "HrdBufferInitialFillPercentage": obj.get("HrdBufferInitialFillPercentage"),
            "HrdBufferSize": obj.get("HrdBufferSize"),
            "InterlaceMode": H264InterlaceMode.from_dict(obj["InterlaceMode"]) if obj.get("InterlaceMode") is not None else None,
            "MaxBitrate": obj.get("MaxBitrate"),
            "MinIInterval": obj.get("MinIInterval"),
            "NumberBFramesBetweenReferenceFrames": obj.get("NumberBFramesBetweenReferenceFrames"),
            "NumberReferenceFrames": obj.get("NumberReferenceFrames"),
            "ParControl": H264ParControl.from_dict(obj["ParControl"]) if obj.get("ParControl") is not None else None,
            "ParDenominator": obj.get("ParDenominator"),
            "ParNumerator": obj.get("ParNumerator"),
            "QualityTuningLevel": H264QualityTuningLevel.from_dict(obj["QualityTuningLevel"]) if obj.get("QualityTuningLevel") is not None else None,
            "QvbrSettings": H264SettingsQvbrSettings.from_dict(obj["QvbrSettings"]) if obj.get("QvbrSettings") is not None else None,
            "RateControlMode": H264RateControlMode.from_dict(obj["RateControlMode"]) if obj.get("RateControlMode") is not None else None,
            "RepeatPps": H264RepeatPps.from_dict(obj["RepeatPps"]) if obj.get("RepeatPps") is not None else None,
            "ScanTypeConversionMode": H264ScanTypeConversionMode.from_dict(obj["ScanTypeConversionMode"]) if obj.get("ScanTypeConversionMode") is not None else None,
            "SceneChangeDetect": H264SceneChangeDetect.from_dict(obj["SceneChangeDetect"]) if obj.get("SceneChangeDetect") is not None else None,
            "Slices": obj.get("Slices"),
            "SlowPal": H264SlowPal.from_dict(obj["SlowPal"]) if obj.get("SlowPal") is not None else None,
            "Softness": obj.get("Softness"),
            "SpatialAdaptiveQuantization": H264SpatialAdaptiveQuantization.from_dict(obj["SpatialAdaptiveQuantization"]) if obj.get("SpatialAdaptiveQuantization") is not None else None,
            "Syntax": H264Syntax.from_dict(obj["Syntax"]) if obj.get("Syntax") is not None else None,
            "Telecine": H264Telecine.from_dict(obj["Telecine"]) if obj.get("Telecine") is not None else None,
            "TemporalAdaptiveQuantization": H264TemporalAdaptiveQuantization.from_dict(obj["TemporalAdaptiveQuantization"]) if obj.get("TemporalAdaptiveQuantization") is not None else None,
            "UnregisteredSeiTimecode": H264UnregisteredSeiTimecode.from_dict(obj["UnregisteredSeiTimecode"]) if obj.get("UnregisteredSeiTimecode") is not None else None
        })
        return _obj



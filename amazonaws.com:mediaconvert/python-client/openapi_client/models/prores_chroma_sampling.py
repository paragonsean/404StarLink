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
import json
from enum import Enum
from typing_extensions import Self


class ProresChromaSampling(str, Enum):
    """
    This setting applies only to ProRes 4444 and ProRes 4444 XQ outputs that you create from inputs that use 4:4:4 chroma sampling. Set Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING) to allow outputs to also use 4:4:4 chroma sampling. You must specify a value for this setting when your output codec profile supports 4:4:4 chroma sampling. Related Settings: When you set Chroma sampling to Preserve 4:4:4 sampling (PRESERVE_444_SAMPLING), you must choose an output codec profile that supports 4:4:4 chroma sampling. These values for Profile (CodecProfile) support 4:4:4 chroma sampling: Apple ProRes 4444 (APPLE_PRORES_4444) or Apple ProRes 4444 XQ (APPLE_PRORES_4444_XQ). When you set Chroma sampling to Preserve 4:4:4 sampling, you must disable all video preprocessors except for Nexguard file marker (PartnerWatermarking). When you set Chroma sampling to Preserve 4:4:4 sampling and use framerate conversion, you must set Frame rate conversion algorithm (FramerateConversionAlgorithm) to Drop duplicate (DUPLICATE_DROP).
    """

    """
    allowed enum values
    """
    PRESERVE_444_SAMPLING = 'PRESERVE_444_SAMPLING'
    SUBSAMPLE_TO_422 = 'SUBSAMPLE_TO_422'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of ProresChromaSampling from a JSON string"""
        return cls(json.loads(json_str))



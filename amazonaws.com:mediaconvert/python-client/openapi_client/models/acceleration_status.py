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


class AccelerationStatus(str, Enum):
    """
    Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus is IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible with accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings aren't compatible with accelerated transcoding, the service either fails your job or runs it without accelerated transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
    """

    """
    allowed enum values
    """
    NOT_APPLICABLE = 'NOT_APPLICABLE'
    IN_PROGRESS = 'IN_PROGRESS'
    ACCELERATED = 'ACCELERATED'
    NOT_ACCELERATED = 'NOT_ACCELERATED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of AccelerationStatus from a JSON string"""
        return cls(json.loads(json_str))



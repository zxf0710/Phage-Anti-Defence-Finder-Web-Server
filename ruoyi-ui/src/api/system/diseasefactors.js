import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listDiseasefactors(query) {
  return request({
    url: '/system/diseasefactors/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getDiseasefactors(patientId) {
  return request({
    url: '/system/diseasefactors/' + patientId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addDiseasefactors(data) {
  return request({
    url: '/system/diseasefactors',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateDiseasefactors(data) {
  return request({
    url: '/system/diseasefactors',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delDiseasefactors(patientId) {
  return request({
    url: '/system/diseasefactors/' + patientId,
    method: 'delete'
  })
}
